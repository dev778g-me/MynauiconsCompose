package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Google: ImageVector
    get() {
        if (_Google != null) {
            return _Google!!
        }
        _Google = ImageVector.Builder(
            name = "Outline.Google",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(20.839f, 10.38f)
                horizontalLineToRelative(-8.656f)
                verticalLineToRelative(3.33f)
                horizontalLineToRelative(5.065f)
                curveToRelative(-0.092f, 0.81f, -0.645f, 2.07f, -1.842f, 2.88f)
                curveToRelative(-0.737f, 0.54f, -1.842f, 0.9f, -3.223f, 0.9f)
                curveToRelative(-3.079f, 0f, -5.525f, -2.572f, -5.525f, -5.58f)
                curveToRelative(0f, -2.923f, 2.585f, -5.49f, 5.525f, -5.49f)
                curveToRelative(1.75f, 0f, 2.855f, 0.72f, 3.591f, 1.35f)
                lineToRelative(2.579f, -2.52f)
                curveTo(16.787f, 3.9f, 14.669f, 3f, 12.183f, 3f)
                curveTo(8.592f, 3f, 5.461f, 4.98f, 3.987f, 7.95f)
                arcToRelative(8.8f, 8.8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 8.1f)
                curveTo(5.461f, 19.02f, 8.592f, 21f, 12.183f, 21f)
                curveToRelative(2.486f, 0f, 4.604f, -0.81f, 6.078f, -2.16f)
                curveToRelative(2.4f, -2.1f, 3.095f, -5.427f, 2.578f, -8.46f)
            }
        }.build()

        return _Google!!
    }

@Suppress("ObjectPropertyName")
private var _Google: ImageVector? = null
