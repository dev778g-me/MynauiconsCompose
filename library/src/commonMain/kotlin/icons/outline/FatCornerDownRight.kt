package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.FatCornerDownRight: ImageVector
    get() {
        if (_FatCornerDownRight != null) {
            return _FatCornerDownRight!!
        }
        _FatCornerDownRight = ImageVector.Builder(
            name = "Outline.FatCornerDownRight",
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
                moveTo(3f, 4.077f)
                quadToRelative(3.303f, 4.216f, 5.866f, 4.785f)
                quadToRelative(2.564f, 0.569f, 4.88f, 0.172f)
                verticalLineTo(4f)
                lineTo(21f, 12.214f)
                lineTo(13.747f, 20f)
                verticalLineToRelative(-4.784f)
                quadTo(9.46f, 15.18f, 6.46f, 12f)
                reflectiveQuadTo(3f, 4.077f)
            }
        }.build()

        return _FatCornerDownRight!!
    }

@Suppress("ObjectPropertyName")
private var _FatCornerDownRight: ImageVector? = null
