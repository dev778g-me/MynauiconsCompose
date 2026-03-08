package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.FatCornerLeftUp: ImageVector
    get() {
        if (_FatCornerLeftUp != null) {
            return _FatCornerLeftUp!!
        }
        _FatCornerLeftUp = ImageVector.Builder(
            name = "Outline.FatCornerLeftUp",
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
                moveTo(19.923f, 21f)
                quadToRelative(-4.216f, -3.303f, -4.785f, -5.866f)
                quadToRelative(-0.569f, -2.564f, -0.172f, -4.88f)
                horizontalLineTo(20f)
                lineTo(11.786f, 3f)
                lineTo(4f, 10.253f)
                horizontalLineToRelative(4.784f)
                quadTo(8.82f, 14.54f, 12f, 17.54f)
                reflectiveQuadTo(19.923f, 21f)
            }
        }.build()

        return _FatCornerLeftUp!!
    }

@Suppress("ObjectPropertyName")
private var _FatCornerLeftUp: ImageVector? = null
