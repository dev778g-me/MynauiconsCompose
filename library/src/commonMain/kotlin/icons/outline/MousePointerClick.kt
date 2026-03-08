package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.MousePointerClick: ImageVector
    get() {
        if (_MousePointerClick != null) {
            return _MousePointerClick!!
        }
        _MousePointerClick = ImageVector.Builder(
            name = "Outline.MousePointerClick",
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
                moveTo(6.92f, 6.956f)
                lineTo(5.45f, 5.473f)
                moveToRelative(9.309f, 1.483f)
                lineToRelative(1.47f, -1.483f)
                moveToRelative(-10.78f, 10.88f)
                lineToRelative(1.47f, -1.484f)
                moveToRelative(3.92f, -9.89f)
                verticalLineTo(3f)
                moveToRelative(-5.88f, 7.913f)
                horizontalLineTo(3f)
                moveToRelative(13.875f, 5.923f)
                lineToRelative(3.814f, -1.506f)
                arcToRelative(0.496f, 0.496f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -0.921f)
                lineToRelative(-9.165f, -3.615f)
                arcToRelative(0.492f, 0.492f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.635f, 0.64f)
                lineToRelative(3.582f, 9.251f)
                curveToRelative(0.162f, 0.42f, 0.75f, 0.42f, 0.912f, 0f)
                close()
            }
        }.build()

        return _MousePointerClick!!
    }

@Suppress("ObjectPropertyName")
private var _MousePointerClick: ImageVector? = null
