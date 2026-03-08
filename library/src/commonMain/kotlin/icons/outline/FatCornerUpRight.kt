package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.FatCornerUpRight: ImageVector
    get() {
        if (_FatCornerUpRight != null) {
            return _FatCornerUpRight!!
        }
        _FatCornerUpRight = ImageVector.Builder(
            name = "Outline.FatCornerUpRight",
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
                moveTo(3f, 19.923f)
                quadToRelative(3.303f, -4.216f, 5.866f, -4.785f)
                quadToRelative(2.564f, -0.569f, 4.88f, -0.172f)
                verticalLineTo(20f)
                lineTo(21f, 11.786f)
                lineTo(13.747f, 4f)
                verticalLineToRelative(4.784f)
                quadTo(9.46f, 8.82f, 6.46f, 12f)
                reflectiveQuadTo(3f, 19.923f)
            }
        }.build()

        return _FatCornerUpRight!!
    }

@Suppress("ObjectPropertyName")
private var _FatCornerUpRight: ImageVector? = null
