package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.ChatPlus: ImageVector
    get() {
        if (_ChatPlus != null) {
            return _ChatPlus!!
        }
        _ChatPlus = ImageVector.Builder(
            name = "Outline.ChatPlus",
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
                moveTo(9.5f, 12f)
                horizontalLineToRelative(5f)
                moveTo(12f, 9.5f)
                verticalLineToRelative(5f)
                moveToRelative(0f, 6.5f)
                arcToRelative(9f, 9f, 0f, isMoreThanHalf = true, isPositiveArc = false, -9f, -9f)
                curveToRelative(0f, 1.44f, 0.338f, 2.8f, 0.94f, 4.007f)
                curveToRelative(0.453f, 0.911f, -0.177f, 2.14f, -0.417f, 3.037f)
                arcToRelative(1.17f, 1.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 1.433f, 1.433f)
                curveToRelative(0.897f, -0.24f, 2.126f, -0.87f, 3.037f, -0.416f)
                arcTo(9f, 9f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 21f)
            }
        }.build()

        return _ChatPlus!!
    }

@Suppress("ObjectPropertyName")
private var _ChatPlus: ImageVector? = null
