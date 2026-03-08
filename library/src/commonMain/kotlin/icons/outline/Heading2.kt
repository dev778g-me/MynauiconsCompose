package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Heading2: ImageVector
    get() {
        if (_Heading2 != null) {
            return _Heading2!!
        }
        _Heading2 = ImageVector.Builder(
            name = "Outline.Heading2",
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
                moveTo(16f, 11.939f)
                curveToRelative(0f, -3.252f, 5f, -3.252f, 5f, 0f)
                curveToRelative(0f, 2.873f, -5f, 5.007f, -5f, 7.561f)
                horizontalLineToRelative(5f)
                moveTo(3.75f, 4.5f)
                verticalLineToRelative(15f)
                moveToRelative(9.5f, -15f)
                verticalLineToRelative(15f)
                moveTo(3.75f, 12f)
                horizontalLineToRelative(9.5f)
            }
        }.build()

        return _Heading2!!
    }

@Suppress("ObjectPropertyName")
private var _Heading2: ImageVector? = null
