package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.FatCornerLeftDown: ImageVector
    get() {
        if (_FatCornerLeftDown != null) {
            return _FatCornerLeftDown!!
        }
        _FatCornerLeftDown = ImageVector.Builder(
            name = "Outline.FatCornerLeftDown",
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
                moveTo(19.923f, 3f)
                quadToRelative(-4.216f, 3.303f, -4.785f, 5.866f)
                quadToRelative(-0.569f, 2.564f, -0.172f, 4.88f)
                horizontalLineTo(20f)
                lineTo(11.786f, 21f)
                lineTo(4f, 13.747f)
                horizontalLineToRelative(4.784f)
                quadTo(8.82f, 9.46f, 12f, 6.46f)
                reflectiveQuadTo(19.923f, 3f)
            }
        }.build()

        return _FatCornerLeftDown!!
    }

@Suppress("ObjectPropertyName")
private var _FatCornerLeftDown: ImageVector? = null
