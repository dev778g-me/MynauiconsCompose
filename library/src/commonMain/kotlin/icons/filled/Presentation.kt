package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.Presentation: ImageVector
    get() {
        if (_Presentation != null) {
            return _Presentation!!
        }
        _Presentation = ImageVector.Builder(
            name = "Filled.Presentation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2.25f, 4f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3.25f)
                horizontalLineToRelative(18f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, 1.5f)
                horizontalLineToRelative(-1.15f)
                verticalLineToRelative(9.028f)
                curveToRelative(0f, 0.673f, -0.271f, 1.317f, -0.75f, 1.79f)
                arcToRelative(2.56f, 2.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.8f, 0.738f)
                horizontalLineToRelative(-3.473f)
                lineToRelative(3.2f, 3.16f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.054f, 1.068f)
                lineTo(12f, 16.61f)
                lineToRelative(-3.973f, 3.924f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = true, isPositiveArc = true, -1.054f, -1.068f)
                lineToRelative(3.2f, -3.16f)
                horizontalLineTo(6.7f)
                curveToRelative(-0.673f, 0f, -1.32f, -0.265f, -1.8f, -0.738f)
                arcToRelative(2.52f, 2.52f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.75f, -1.79f)
                verticalLineTo(4.75f)
                horizontalLineTo(3f)
                arcTo(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 2.25f, 4f)
            }
        }.build()

        return _Presentation!!
    }

@Suppress("ObjectPropertyName")
private var _Presentation: ImageVector? = null
