package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CloudFog: ImageVector
    get() {
        if (_CloudFog != null) {
            return _CloudFog!!
        }
        _CloudFog = ImageVector.Builder(
            name = "Outline.CloudFog",
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
                moveTo(19.825f, 17f)
                curveToRelative(4.495f, -3.16f, 0.475f, -7.73f, -3.706f, -7.73f)
                curveTo(13.296f, -1.732f, -3.265f, 7.368f, 4.074f, 15.662f)
                moveTo(16f, 16.5f)
                horizontalLineTo(8f)
                moveToRelative(7f, 4f)
                horizontalLineTo(6f)
            }
        }.build()

        return _CloudFog!!
    }

@Suppress("ObjectPropertyName")
private var _CloudFog: ImageVector? = null
