package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.Codepen: ImageVector
    get() {
        if (_Codepen != null) {
            return _Codepen!!
        }
        _Codepen = ImageVector.Builder(
            name = "Outline.Codepen",
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
                moveToRelative(12f, 4f)
                lineToRelative(8f, 5.2f)
                moveTo(12f, 4f)
                lineTo(4f, 9.2f)
                moveTo(12f, 4f)
                verticalLineToRelative(5.2f)
                moveToRelative(8f, 0f)
                verticalLineToRelative(5.6f)
                moveToRelative(0f, -5.6f)
                lineToRelative(-8f, 5.6f)
                moveToRelative(8f, 0f)
                lineTo(12f, 20f)
                moveToRelative(8f, -5.2f)
                lineToRelative(-8f, -5.6f)
                moveTo(12f, 20f)
                lineToRelative(-8f, -5.2f)
                moveToRelative(8f, 5.2f)
                verticalLineToRelative(-5.2f)
                moveToRelative(-8f, 0f)
                verticalLineTo(9.2f)
                moveToRelative(0f, 5.6f)
                lineToRelative(8f, -5.6f)
                moveToRelative(-8f, 0f)
                lineToRelative(8f, 5.6f)
            }
        }.build()

        return _Codepen!!
    }

@Suppress("ObjectPropertyName")
private var _Codepen: ImageVector? = null
