package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.FatCornerUpLeft: ImageVector
    get() {
        if (_FatCornerUpLeft != null) {
            return _FatCornerUpLeft!!
        }
        _FatCornerUpLeft = ImageVector.Builder(
            name = "Outline.FatCornerUpLeft",
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
                moveTo(21f, 19.923f)
                quadToRelative(-3.303f, -4.216f, -5.866f, -4.785f)
                quadToRelative(-2.564f, -0.569f, -4.88f, -0.172f)
                verticalLineTo(20f)
                lineTo(3f, 11.786f)
                lineTo(10.253f, 4f)
                verticalLineToRelative(4.784f)
                quadTo(14.54f, 8.82f, 17.54f, 12f)
                reflectiveQuadTo(21f, 19.923f)
            }
        }.build()

        return _FatCornerUpLeft!!
    }

@Suppress("ObjectPropertyName")
private var _FatCornerUpLeft: ImageVector? = null
