package MynaIcons.outline

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Outline.CogFour: ImageVector
    get() {
        if (_CogFour != null) {
            return _CogFour!!
        }
        _CogFour = ImageVector.Builder(
            name = "Outline.CogFour",
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
                moveTo(14.5f, 12f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = true, isPositiveArc = false, -5f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, isMoreThanHalf = false, isPositiveArc = false, 5f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 1.5f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(10f, 4.89f)
                curveToRelative(0f, 1.435f, -1.802f, 2.534f, -3.074f, 1.792f)
                curveToRelative(-2.271f, -1.223f, -3.996f, 2.145f, -1.99f, 3.496f)
                curveToRelative(1.224f, 0.714f, 1.225f, 2.88f, 0f, 3.595f)
                curveToRelative(-2.163f, 1.311f, -0.189f, 4.66f, 1.99f, 3.486f)
                curveToRelative(1.379f, -0.804f, 3.075f, 0.512f, 3.075f, 1.956f)
                curveToRelative(0f, 2.411f, 3.98f, 2.349f, 3.98f, 0f)
                curveToRelative(0f, -1.471f, 1.67f, -2.775f, 3.074f, -1.956f)
                curveToRelative(2.24f, 1.207f, 4.168f, -2.312f, 1.99f, -3.486f)
                curveToRelative(-1.226f, -0.715f, -1.225f, -2.89f, 0f, -3.604f)
                curveToRelative(2.163f, -1.311f, 0.19f, -4.66f, -1.99f, -3.487f)
                curveToRelative(-1.243f, 0.726f, -3.073f, -0.363f, -3.074f, -1.792f)
                curveToRelative(0f, -2.56f, -3.98f, -2.48f, -3.98f, 0f)
            }
        }.build()

        return _CogFour!!
    }

@Suppress("ObjectPropertyName")
private var _CogFour: ImageVector? = null
