package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CloudDrizzle: ImageVector
    get() {
        if (_CloudDrizzle != null) {
            return _CloudDrizzle!!
        }
        _CloudDrizzle = ImageVector.Builder(
            name = "Outline.CloudDrizzle",
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
                moveTo(12.004f, 17.5f)
                lineTo(12f, 17f)
                moveToRelative(4.004f, -1.5f)
                lineTo(16f, 15f)
                moveToRelative(-7.996f, 0.5f)
                lineTo(8f, 15f)
                moveToRelative(4.004f, 6f)
                lineTo(12f, 20.5f)
                moveToRelative(4.004f, -1.5f)
                lineTo(16f, 18.5f)
                moveToRelative(-7.996f, 0.5f)
                lineTo(8f, 18.5f)
                moveTo(19.825f, 17f)
                curveToRelative(4.495f, -3.16f, 0.475f, -7.73f, -3.706f, -7.73f)
                curveTo(13.296f, -1.732f, -3.265f, 7.368f, 4.074f, 15.662f)
            }
        }.build()

        return _CloudDrizzle!!
    }

@Suppress("ObjectPropertyName")
private var _CloudDrizzle: ImageVector? = null
