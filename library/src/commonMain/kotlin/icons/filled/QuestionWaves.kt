package MynaIcons.filled

import icons.MynaIcons
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MynaIcons.Filled.QuestionWaves: ImageVector
    get() {
        if (_QuestionWaves != null) {
            return _QuestionWaves!!
        }
        _QuestionWaves = ImageVector.Builder(
            name = "Filled.QuestionWaves",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.435f, 2.075f)
                arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.87f, 0f)
                curveToRelative(-0.394f, 0.189f, -0.755f, 0.497f, -1.26f, 0.928f)
                lineToRelative(-0.079f, 0.066f)
                arcToRelative(2.56f, 2.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.58f, 0.655f)
                lineToRelative(-0.102f, 0.008f)
                curveToRelative(-0.662f, 0.053f, -1.135f, 0.09f, -1.547f, 0.236f)
                arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.03f, 2.029f)
                curveToRelative(-0.145f, 0.412f, -0.182f, 0.885f, -0.235f, 1.547f)
                lineToRelative(-0.008f, 0.102f)
                arcToRelative(2.56f, 2.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.655f, 1.58f)
                lineToRelative(-0.066f, 0.078f)
                curveToRelative(-0.431f, 0.506f, -0.74f, 0.867f, -0.928f, 1.261f)
                arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 2.87f)
                curveToRelative(0.189f, 0.394f, 0.497f, 0.755f, 0.928f, 1.26f)
                lineToRelative(0.066f, 0.079f)
                curveToRelative(0.41f, 0.48f, 0.604f, 0.939f, 0.655f, 1.58f)
                lineToRelative(0.008f, 0.102f)
                curveToRelative(0.053f, 0.662f, 0.09f, 1.135f, 0.236f, 1.547f)
                arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.029f, 2.03f)
                curveToRelative(0.412f, 0.145f, 0.885f, 0.182f, 1.547f, 0.235f)
                lineToRelative(0.102f, 0.008f)
                curveToRelative(0.629f, 0.05f, 1.09f, 0.238f, 1.58f, 0.655f)
                lineToRelative(0.078f, 0.066f)
                curveToRelative(0.506f, 0.431f, 0.867f, 0.74f, 1.261f, 0.928f)
                arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.87f, 0f)
                curveToRelative(0.394f, -0.189f, 0.755f, -0.497f, 1.26f, -0.928f)
                lineToRelative(0.079f, -0.066f)
                curveToRelative(0.48f, -0.41f, 0.939f, -0.604f, 1.58f, -0.655f)
                lineToRelative(0.102f, -0.008f)
                curveToRelative(0.662f, -0.053f, 1.135f, -0.09f, 1.547f, -0.236f)
                arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 2.03f, -2.029f)
                curveToRelative(0.145f, -0.412f, 0.182f, -0.885f, 0.235f, -1.547f)
                lineToRelative(0.008f, -0.102f)
                curveToRelative(0.05f, -0.629f, 0.238f, -1.09f, 0.655f, -1.58f)
                lineToRelative(0.066f, -0.079f)
                curveToRelative(0.431f, -0.505f, 0.74f, -0.866f, 0.928f, -1.26f)
                arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -2.87f)
                curveToRelative(-0.189f, -0.394f, -0.497f, -0.755f, -0.928f, -1.26f)
                lineToRelative(-0.066f, -0.079f)
                arcToRelative(2.56f, 2.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -0.655f, -1.58f)
                lineToRelative(-0.008f, -0.102f)
                curveToRelative(-0.053f, -0.662f, -0.09f, -1.135f, -0.236f, -1.547f)
                arcToRelative(3.33f, 3.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2.029f, -2.03f)
                curveToRelative(-0.412f, -0.145f, -0.885f, -0.182f, -1.547f, -0.235f)
                lineToRelative(-0.102f, -0.008f)
                arcToRelative(2.56f, 2.56f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.58f, -0.655f)
                lineToRelative(-0.079f, -0.066f)
                curveToRelative(-0.505f, -0.431f, -0.866f, -0.74f, -1.26f, -0.928f)
                moveTo(12f, 14.747f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, 0.75f)
                verticalLineToRelative(0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                verticalLineToRelative(-0.5f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0.75f, -0.75f)
                moveToRelative(1.872f, -6.814f)
                curveToRelative(0.544f, 0.482f, 0.878f, 1.188f, 0.878f, 2.057f)
                curveToRelative(0f, 0.64f, -0.164f, 1.138f, -0.45f, 1.543f)
                curveToRelative(-0.256f, 0.365f, -0.588f, 0.614f, -0.823f, 0.79f)
                lineToRelative(-0.027f, 0.02f)
                curveToRelative(-0.263f, 0.198f, -0.416f, 0.32f, -0.524f, 0.474f)
                curveToRelative(-0.09f, 0.127f, -0.176f, 0.317f, -0.176f, 0.68f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                curveToRelative(0f, -0.64f, 0.164f, -1.14f, 0.45f, -1.544f)
                curveToRelative(0.256f, -0.364f, 0.588f, -0.613f, 0.823f, -0.79f)
                lineToRelative(0.027f, -0.02f)
                curveToRelative(0.263f, -0.198f, 0.416f, -0.32f, 0.524f, -0.474f)
                curveToRelative(0.09f, -0.127f, 0.176f, -0.317f, 0.176f, -0.679f)
                curveToRelative(0f, -0.46f, -0.166f, -0.75f, -0.372f, -0.934f)
                arcToRelative(1.33f, 1.33f, 0f, isMoreThanHalf = false, isPositiveArc = false, -0.878f, -0.31f)
                curveToRelative(-0.34f, 0f, -0.657f, 0.114f, -0.877f, 0.31f)
                curveToRelative(-0.207f, 0.183f, -0.373f, 0.474f, -0.373f, 0.934f)
                arcToRelative(0.75f, 0.75f, 0f, isMoreThanHalf = false, isPositiveArc = true, -1.5f, 0f)
                curveToRelative(0f, -0.869f, 0.334f, -1.575f, 0.877f, -2.057f)
                arcTo(2.83f, 2.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 12f, 7.246f)
                curveToRelative(0.66f, 0f, 1.343f, 0.218f, 1.872f, 0.687f)
            }
        }.build()

        return _QuestionWaves!!
    }

@Suppress("ObjectPropertyName")
private var _QuestionWaves: ImageVector? = null
